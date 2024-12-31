/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultBaseItemRespDto;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for ChannelServiceApi
 */
@Ignore
public class ChannelServiceApiTest {

    private final ChannelServiceApi api = new ChannelServiceApi();

    /**
     * Gets available channels
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getChannelsTest() throws Exception {
        String userId = null;
        Integer startIndex = null;
        String fields = null;
        Integer limit = null;
        Boolean enableImages = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        Boolean enableUserData = null;
        QueryResultBaseItemRespDto response = api.getChannels(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData);

        // TODO: test validations
    }
}
