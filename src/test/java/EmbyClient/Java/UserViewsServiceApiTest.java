/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultBaseItemRespDto;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for UserViewsServiceApi
 */
@Ignore
public class UserViewsServiceApiTest {

    private final UserViewsServiceApi api = new UserViewsServiceApi();

    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridViewsTest() throws Exception {
        String userId = null;
        Boolean includeExternalContent = null;
        QueryResultBaseItemRespDto response = api.getUsersByUseridViews(userId, includeExternalContent);

        // TODO: test validations
    }
}
