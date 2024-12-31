/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultBaseItemRespDto;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for SuggestionsServiceApi
 */
@Ignore
public class SuggestionsServiceApiTest {

    private final SuggestionsServiceApi api = new SuggestionsServiceApi();

    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridSuggestionsTest() throws Exception {
        String userId = null;
        String fields = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemRespDto response = api.getUsersByUseridSuggestions(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
}
