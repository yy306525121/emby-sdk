package io.swagger.client.model;

import lombok.Data;

/**
 * @author yangzy
 */
@Data
public class QueryResultBaseItemReqDto {
    /**
     * Artist or AlbumArtist (optional)
     */
    private String artistType;
    /**
     * Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     */
    private String maxOfficialRating;
    /**
     * Optional filter by items with theme songs. (optional)
     */
    private Boolean hasThemeSong;
    /**
     * Optional filter by items with theme videos. (optional)
     */
    private Boolean hasThemeVideo;
    /**
     * Optional filter by items with subtitles. (optional)
     */
    private Boolean hasSubtitles;
    /**
     * Optional filter by items with special features. (optional)
     */
    private Boolean hasSpecialFeature;
    /**
     * Optional filter by items with trailers. (optional)
     */
    private Boolean hasTrailer;
    /**
     * Optional. Return items that are siblings of a supplied item. (optional)
     */
    private String adjacentTo;
    /**
     * Optional filter by minimum index number. (optional)
     */
    private Integer minIndexNumber;
    /**
     * Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     */
    private String minStartDate;
    /**
     * Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     */
    private String maxStartDate;
    /**
     * Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     */
    private String minEndDate;
    /**
     * Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     */
    private String maxEndDate;
    /**
     * Optional filter by minimum number of game players. (optional)
     */
    private Integer minPlayers;
    /**
     * Optional filter by maximum number of game players. (optional)
     */
    private Integer maxPlayers;
    /**
     * Optional filter by parent index number. (optional)
     */
    private Integer parentIndexNumber;
    /**
     * Optional filter by items that have or do not have a parental rating (optional)
     */
    private Boolean hasParentalRating;
    /**
     * Optional filter by items that are HD or not. (optional)
     */
    private Boolean isHD;
    /**
     * Optional filter by items that are unaired episodes or not. (optional)
     */
    private Boolean isUnaired;
    /**
     * Optional filter by minimum community rating. (optional)
     */
    private Double minCommunityRating;
    /**
     * Optional filter by minimum critic rating. (optional)
     */
    private Double minCriticRating;
    /**
     * Gets all episodes that aired during a season, including specials. (optional)
     */
    private Integer airedDuringSeason;
    /**
     * Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     */
    private String minPremiereDate;
    /**
     * Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     */
    private String minDateLastSaved;
    /**
     * Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     */
    private String minDateLastSavedForUser;
    /**
     * Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     */
    private String maxPremiereDate;
    /**
     * Optional filter by items that have an overview or not. (optional)
     */
    private Boolean hasOverview;
    /**
     * Optional filter by items that have an imdb id or not. (optional)
     */
    private Boolean hasImdbId;
    /**
     * Optional filter by items that have a tmdb id or not. (optional)
     */
    private Boolean hasTmdbId;
    /**
     * Optional filter by items that have a tvdb id or not. (optional)
     */
    private Boolean hasTvdbId;
    /**
     * Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     */
    private String excludeItemIds;
    /**
     * Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     */
    private Integer startIndex;
    /**
     * Optional. The maximum number of records to return (optional)
     */
    private Integer limit;
    /**
     * When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     */
    private Boolean recursive;
    /**
     * Enter a search term to perform a search request (optional)
     */
    private String searchTerm;
    /**
     * Sort Order - Ascending,Descending (optional)
     */
    private String sortOrder;
    /**
     * Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     */
    private String parentId;
    /**
     * Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     */
    private String fields;
    /**
     * Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     */
    private String excludeItemTypes;
    /**
     * Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     */
    private String includeItemTypes;
    /**
     * Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     */
    private String anyProviderIdEquals;
    /**
     * Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     */
    private String filters;
    /**
     * Optional filter by items that are marked as favorite, or not. (optional)
     */
    private Boolean isFavorite;
    /**
     * Optional filter for movies. (optional)
     */
    private Boolean isMovie;
    /**
     * Optional filter for series. (optional)
     */
    private Boolean isSeries;
    /**
     * Optional filter for folders. (optional)
     */
    private Boolean isFolder;
    /**
     * Optional filter for news. (optional)
     */
    private Boolean isNews;
    /**
     * Optional filter for kids. (optional)
     */
    private Boolean isKids;
    /**
     * Optional filter for sports. (optional)
     */
    private Boolean isSports;
    /**
     * Optional filter for IsNew. (optional)
     */
    private Boolean isNew;
    /**
     * Optional filter for IsPremiere. (optional)
     */
    private Boolean isPremiere;
    /**
     * Optional filter for IsNewOrPremiere. (optional)
     */
    private Boolean isNewOrPremiere;
    /**
     * Optional filter for IsRepeat. (optional)
     */
    private Boolean isRepeat;
    /**
     * ProjectToMedia (optional)
     */
    private Boolean projectToMedia;
    /**
     * Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     */
    private String mediaTypes;
    /**
     * Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     */
    private String imageTypes;
    /**
     * Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     */
    private String sortBy;
    /**
     * Optional filter by items that are played, or not. (optional)
     */
    private Boolean isPlayed;
    /**
     * Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     */
    private String genres;
    /**
     * Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     */
    private String officialRatings;
    /**
     * Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     */
    private String tags;
    /**
     * Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     */
    private String excludeTags;
    /**
     * Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     */
    private String years;
    /**
     * Optional, include image information in output (optional)
     */
    private Boolean enableImages;
    /**
     * Optional, include user data (optional)
     */
    private Boolean enableUserData;
    /**
     * Optional, the max number of images to return, per image type (optional)
     */
    private Integer imageTypeLimit;
    /**
     * Optional. The image types to include in the output. (optional)
     */
    private String enableImageTypes;
    /**
     * Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     */
    private String person;
    /**
     * Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     */
    private String personIds;
    /**
     * Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     */
    private String personTypes;
    /**
     * Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     */
    private String studios;
    /**
     * Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     */
    private String studioIds;
    /**
     * Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     */
    private String artists;
    /**
     * Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     */
    private String artistIds;
    /**
     * Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     */
    private String albums;
    /**
     * Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     */
    private String ids;
    /**
     * Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     */
    private String videoTypes;
    /**
     * Optional filter by Container. Allows multiple, comma delimeted. (optional)
     */
    private String containers;
    /**
     * Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     */
    private String audioCodecs;
    /**
     * Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     */
    private String audioLayouts;
    /**
     * Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     */
    private String videoCodecs;
    /**
     * Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     */
    private String extendedVideoTypes;
    /**
     * Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     */
    private String subtitleCodecs;
    /**
     * Optional filter by Path. (optional)
     */
    private String path;
    /**
     * User Id (optional)
     */
    private String userId;
    /**
     * Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     */
    private String minOfficialRating;
    /**
     * Optional filter by items that are locked. (optional)
     */
    private Boolean isLocked;
    /**
     * Optional filter by items that are placeholders (optional)
     */
    private Boolean isPlaceHolder;
    /**
     * Optional filter by items that have official ratings (optional)
     */
    private Boolean hasOfficialRating;
    /**
     * Whether or not to hide items behind their boxsets. (optional)
     */
    private Boolean groupItemsIntoCollections;
    /**
     * Optional filter by items that are 3D, or not. (optional)
     */
    private Boolean is3D;
    /**
     * Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     */
    private String seriesStatus;
    /**
     * Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     */
    private String nameStartsWithOrGreater;
    /**
     * Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     */
    private String artistStartsWithOrGreater;
    /**
     * Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     */
    private String albumArtistStartsWithOrGreater;
    /**
     * Optional filter by items whose name is sorted equally than a given input string. (optional)
     */
    private String nameStartsWith;
    /**
     * Optional filter by items whose name is equally or lesser than a given input string. (optional)
     */
    private String nameLessThan;
}
