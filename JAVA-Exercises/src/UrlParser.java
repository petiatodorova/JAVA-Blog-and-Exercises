import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UrlParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String protocol = "";
        String server = "";
        String resource = "";
        String[] protocolServerResource = input.split("://");

        /**
         * The [server] part is mandatory.
         * The [protocol] and [resource] parts are optional.
         */

        if (protocolServerResource.length > 1) {
            protocol = protocolServerResource[0];

            List<String> servRes = Arrays.stream(protocolServerResource[1].split("/")).collect(Collectors.toList());
            server = servRes.get(0);
            servRes.remove(0);
            resource = String.join("/", servRes);

        } else {
            List<String> servRes = Arrays.stream(protocolServerResource[0].split("/")).collect(Collectors.toList());
            server = servRes.get(0);
            servRes.remove(0);
            resource = String.join("/", servRes);
        }

        /**
         * [protocol] = "ftp"
         * [server] = "www.su.us"
         * [resource] = "TestResource"
         */
        String outProtocol = "[protocol] = " + "\"" + protocol + "\"";
        String outServer = "[server] = " + "\"" + server + "\"";
        String outResource = "[resource] = " + "\"" + resource + "\"";
        System.out.println(outProtocol);
        System.out.println(outServer);
        System.out.println(outResource);
    }
}
