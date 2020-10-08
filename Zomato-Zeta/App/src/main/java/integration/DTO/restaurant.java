package integration.DTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "R",
        "apikey",
        "id",
        "name",
        "url",
        "location",
        "switch_to_order_menu",
        "cuisines",
        "timings",
        "average_cost_for_two",
        "price_range",
        "currency",
        "highlights",
        "offers",
        "opentable_support",
        "is_zomato_book_res",
        "mezzo_provider",
        "is_book_form_web_view",
        "book_form_web_view_url",
        "book_again_url",
        "thumb",
        "user_rating",
        "all_reviews_count",
        "photos_url",
        "photo_count",
        "menu_url",
        "featured_image",
        "medio_provider",
        "has_online_delivery",
        "is_delivering_now",
        "store_type",
        "include_bogo_offers",
        "deeplink",
        "is_table_reservation_supported",
        "has_table_booking",
        "events_url",
        "phone_numbers",
        "all_reviews",
        "establishment",
        "establishment_types"
})
public class restaurant {

    @JsonProperty("R")
    private R r;
    @JsonProperty("apikey")
    private String apikey;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("switch_to_order_menu")
    private Integer switchToOrderMenu;
    @JsonProperty("cuisines")
    private String cuisines;
    @JsonProperty("timings")
    private String timings;
    @JsonProperty("average_cost_for_two")
    private Integer averageCostForTwo;
    @JsonProperty("price_range")
    private Integer priceRange;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("highlights")
    private List<String> highlights = null;
    @JsonProperty("offers")
    private List<Object> offers = null;
    @JsonProperty("opentable_support")
    private Integer opentableSupport;
    @JsonProperty("is_zomato_book_res")
    private Integer isZomatoBookRes;
    @JsonProperty("mezzo_provider")
    private String mezzoProvider;
    @JsonProperty("is_book_form_web_view")
    private Integer isBookFormWebView;
    @JsonProperty("book_form_web_view_url")
    private String bookFormWebViewUrl;
    @JsonProperty("book_again_url")
    private String bookAgainUrl;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("user_rating")
    private UserRating userRating;
    @JsonProperty("all_reviews_count")
    private Integer allReviewsCount;
    @JsonProperty("photos_url")
    private String photosUrl;
    @JsonProperty("photo_count")
    private Integer photoCount;
    @JsonProperty("menu_url")
    private String menuUrl;
    @JsonProperty("featured_image")
    private String featuredImage;
    @JsonProperty("medio_provider")
    private Integer medioProvider;
    @JsonProperty("has_online_delivery")
    private Integer hasOnlineDelivery;
    @JsonProperty("is_delivering_now")
    private Integer isDeliveringNow;
    @JsonProperty("store_type")
    private String storeType;
    @JsonProperty("include_bogo_offers")
    private Boolean includeBogoOffers;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("is_table_reservation_supported")
    private Integer isTableReservationSupported;
    @JsonProperty("has_table_booking")
    private Integer hasTableBooking;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("phone_numbers")
    private String phoneNumbers;
    @JsonProperty("all_reviews")
    private AllReviews allReviews;
    @JsonProperty("establishment")
    private List<String> establishment = null;
    @JsonProperty("establishment_types")
    private List<EstablishmentType> establishmentTypes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("R")
    public R getR() {
        return r;
    }

    @JsonProperty("R")
    public void setR(R r) {
        this.r = r;
    }

    @JsonProperty("apikey")
    public String getApikey() {
        return apikey;
    }

    @JsonProperty("apikey")
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("switch_to_order_menu")
    public Integer getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    @JsonProperty("switch_to_order_menu")
    public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    @JsonProperty("cuisines")
    public String getCuisines() {
        return cuisines;
    }

    @JsonProperty("cuisines")
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    @JsonProperty("timings")
    public String getTimings() {
        return timings;
    }

    @JsonProperty("timings")
    public void setTimings(String timings) {
        this.timings = timings;
    }

    @JsonProperty("average_cost_for_two")
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    @JsonProperty("average_cost_for_two")
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    @JsonProperty("price_range")
    public Integer getPriceRange() {
        return priceRange;
    }

    @JsonProperty("price_range")
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("highlights")
    public List<String> getHighlights() {
        return highlights;
    }

    @JsonProperty("highlights")
    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    @JsonProperty("opentable_support")
    public Integer getOpentableSupport() {
        return opentableSupport;
    }

    @JsonProperty("opentable_support")
    public void setOpentableSupport(Integer opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    @JsonProperty("is_zomato_book_res")
    public Integer getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    @JsonProperty("is_zomato_book_res")
    public void setIsZomatoBookRes(Integer isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
    }

    @JsonProperty("mezzo_provider")
    public String getMezzoProvider() {
        return mezzoProvider;
    }

    @JsonProperty("mezzo_provider")
    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    @JsonProperty("is_book_form_web_view")
    public Integer getIsBookFormWebView() {
        return isBookFormWebView;
    }

    @JsonProperty("is_book_form_web_view")
    public void setIsBookFormWebView(Integer isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    @JsonProperty("book_form_web_view_url")
    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    @JsonProperty("book_form_web_view_url")
    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
    }

    @JsonProperty("book_again_url")
    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    @JsonProperty("book_again_url")
    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("user_rating")
    public UserRating getUserRating() {
        return userRating;
    }

    @JsonProperty("user_rating")
    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    @JsonProperty("all_reviews_count")
    public Integer getAllReviewsCount() {
        return allReviewsCount;
    }

    @JsonProperty("all_reviews_count")
    public void setAllReviewsCount(Integer allReviewsCount) {
        this.allReviewsCount = allReviewsCount;
    }

    @JsonProperty("photos_url")
    public String getPhotosUrl() {
        return photosUrl;
    }

    @JsonProperty("photos_url")
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    @JsonProperty("photo_count")
    public Integer getPhotoCount() {
        return photoCount;
    }

    @JsonProperty("photo_count")
    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    @JsonProperty("menu_url")
    public String getMenuUrl() {
        return menuUrl;
    }

    @JsonProperty("menu_url")
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @JsonProperty("featured_image")
    public String getFeaturedImage() {
        return featuredImage;
    }

    @JsonProperty("featured_image")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    @JsonProperty("medio_provider")
    public Integer getMedioProvider() {
        return medioProvider;
    }

    @JsonProperty("medio_provider")
    public void setMedioProvider(Integer medioProvider) {
        this.medioProvider = medioProvider;
    }

    @JsonProperty("has_online_delivery")
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    @JsonProperty("has_online_delivery")
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    @JsonProperty("is_delivering_now")
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    @JsonProperty("is_delivering_now")
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    @JsonProperty("store_type")
    public String getStoreType() {
        return storeType;
    }

    @JsonProperty("store_type")
    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    @JsonProperty("include_bogo_offers")
    public Boolean getIncludeBogoOffers() {
        return includeBogoOffers;
    }

    @JsonProperty("include_bogo_offers")
    public void setIncludeBogoOffers(Boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    @JsonProperty("deeplink")
    public String getDeeplink() {
        return deeplink;
    }

    @JsonProperty("deeplink")
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    @JsonProperty("is_table_reservation_supported")
    public Integer getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    @JsonProperty("is_table_reservation_supported")
    public void setIsTableReservationSupported(Integer isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    @JsonProperty("has_table_booking")
    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    @JsonProperty("has_table_booking")
    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("phone_numbers")
    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phone_numbers")
    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("all_reviews")
    public AllReviews getAllReviews() {
        return allReviews;
    }

    @JsonProperty("all_reviews")
    public void setAllReviews(AllReviews allReviews) {
        this.allReviews = allReviews;
    }

    @JsonProperty("establishment")
    public List<String> getEstablishment() {
        return establishment;
    }

    @JsonProperty("establishment")
    public void setEstablishment(List<String> establishment) {
        this.establishment = establishment;
    }

    @JsonProperty("establishment_types")
    public List<EstablishmentType> getEstablishmentTypes() {
        return establishmentTypes;
    }

    @JsonProperty("establishment_types")
    public void setEstablishmentTypes(List<EstablishmentType> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "RestaurantResponseDto{" +
                "r=" + r +
                ", apikey='" + apikey + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", location=" + location +
                ", switchToOrderMenu=" + switchToOrderMenu +
                ", cuisines='" + cuisines + '\'' +
                ", timings='" + timings + '\'' +
                ", averageCostForTwo=" + averageCostForTwo +
                ", priceRange=" + priceRange +
                ", currency='" + currency + '\'' +
                ", highlights=" + highlights +
                ", offers=" + offers +
                ", opentableSupport=" + opentableSupport +
                ", isZomatoBookRes=" + isZomatoBookRes +
                ", mezzoProvider='" + mezzoProvider + '\'' +
                ", isBookFormWebView=" + isBookFormWebView +
                ", bookFormWebViewUrl='" + bookFormWebViewUrl + '\'' +
                ", bookAgainUrl='" + bookAgainUrl + '\'' +
                ", thumb='" + thumb + '\'' +
                ", userRating=" + userRating +
                ", allReviewsCount=" + allReviewsCount +
                ", photosUrl='" + photosUrl + '\'' +
                ", photoCount=" + photoCount +
                ", menuUrl='" + menuUrl + '\'' +
                ", featuredImage='" + featuredImage + '\'' +
                ", medioProvider=" + medioProvider +
                ", hasOnlineDelivery=" + hasOnlineDelivery +
                ", isDeliveringNow=" + isDeliveringNow +
                ", storeType='" + storeType + '\'' +
                ", includeBogoOffers=" + includeBogoOffers +
                ", deeplink='" + deeplink + '\'' +
                ", isTableReservationSupported=" + isTableReservationSupported +
                ", hasTableBooking=" + hasTableBooking +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                ", allReviews=" + allReviews +
                ", establishment=" + establishment +
                ", establishmentTypes=" + establishmentTypes +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
