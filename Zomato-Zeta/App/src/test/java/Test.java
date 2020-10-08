import integration.DTO.SearchResponseDto;
import integration.api.SearchApi;
import org.assertj.core.api.Assertions;

@org.testng.annotations.Test

public class Test {

    private static String token = "8e4ad781d77247e64fe039367f7188e0";

    @org.testng.annotations.Test
    public void search(){
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,1 , token,null,null,null,null);
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();
    }

    @org.testng.annotations.Test
    public void searchWithoutEntityId(){
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(null,"city",10,10 , token,null,null,null,null);
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(10);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(10);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();
        Assertions.assertThat(searchResponseDto.getRestaurants().get(0).getRestaurant().getLocation().getCityId()).isEqualTo(52);
        Assertions.assertThat(searchResponseDto.getRestaurants().get(0).getRestaurant().getLocation().getCity()).isEqualTo("Singapore");
    }

    @org.testng.annotations.Test
    public void searchByCategory(){
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(null,null,1,10 , token,null,null,"Nightlife","desc");
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(10);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();
        Assertions.assertThat(searchResponseDto.getRestaurants().get(0).getRestaurant().getEstablishment()).isNotEmpty();
    }


    @org.testng.annotations.Test
    public void searchwithoutCount(){
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,null , token,null,null,null,null );
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(20);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();
    }

    @org.testng.annotations.Test
    public void searchEmpty() {
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",-2,0 , token,null,null,null,null);
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(0);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(-2);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isEmpty();
    }


    @org.testng.annotations.Test
    public void searchSortCostByAsc() throws Exception{
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,20 , token,"Delhi","cost",null,"asc");
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(20);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();

        for (int i =0 ; i<searchResponseDto.getRestaurants().size()-1;i++){
            if ((searchResponseDto.getRestaurants().get(i).getRestaurant().getAverageCostForTwo()) > (searchResponseDto.getRestaurants().get(i+1).getRestaurant().getAverageCostForTwo())){
                Assertions.fail("error messagee");
            }
            else {
                Assertions.assertThat(searchResponseDto.getRestaurants().get(i).getRestaurant().getAverageCostForTwo()).isNotNull();
            }
        }
    }

    @org.testng.annotations.Test
    public void searchSortCostByDesc() throws Exception{
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,20 , token,"Delhi","cost",null,"desc");
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(20);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();

        for (int i =0 ; i<searchResponseDto.getRestaurants().size()-1;i++){
            if ((searchResponseDto.getRestaurants().get(i).getRestaurant().getAverageCostForTwo()) < (searchResponseDto.getRestaurants().get(i+1).getRestaurant().getAverageCostForTwo())){
                Assertions.fail("error message");
            }
            else {
                Assertions.assertThat(searchResponseDto.getRestaurants().get(i).getRestaurant().getAverageCostForTwo()).isNotNull();
            }
        }
    }


    @org.testng.annotations.Test
    public void searchSortRatingByDesc() throws Exception{
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,20 , token,"Delhi","rating",null,"desc");
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(20);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();

        for (int i =0 ; i<searchResponseDto.getRestaurants().size()-1;i++){
            float x = Float.parseFloat(searchResponseDto.getRestaurants().get(i).getRestaurant().getUserRating().getAggregateRating());
            float y = Float.parseFloat(searchResponseDto.getRestaurants().get(i+1).getRestaurant().getUserRating().getAggregateRating());

            if (x<y){
                Assertions.fail("error message");
            }
            else {
                Assertions.assertThat(searchResponseDto.getRestaurants().get(i).getRestaurant().getUserRating().getAggregateRating()).isNotNull();
            }
        }
    }

    @org.testng.annotations.Test
    public void searchSortRatingByAsc() throws Exception{
        SearchResponseDto searchResponseDto=  new SearchApi().getResponse(1,"city",1,20 , token,"Delhi","rating",null,"asc");
        Assertions.assertThat(searchResponseDto.getResultsFound()).isNotNull();
        Assertions.assertThat(searchResponseDto.getResultsShown()).isEqualTo(20);
        Assertions.assertThat(searchResponseDto.getResultsStart()).isEqualTo(1);
        Assertions.assertThat(searchResponseDto.getRestaurants()).isNotEmpty();


        for (int i =0 ; i<searchResponseDto.getRestaurants().size()-1;i++){
            float x = Float.parseFloat(searchResponseDto.getRestaurants().get(i).getRestaurant().getUserRating().getAggregateRating());
            float y = Float.parseFloat(searchResponseDto.getRestaurants().get(i+1).getRestaurant().getUserRating().getAggregateRating());

            if (x>y){
                Assertions.fail("error message");
            }
            else {
                Assertions.assertThat(searchResponseDto.getRestaurants().get(i).getRestaurant().getUserRating().getAggregateRating()).isNotNull();
            }
        }
    }
}
