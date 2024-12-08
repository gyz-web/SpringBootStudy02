package RPC;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        Configuration configuration=new Configuration();
        userService client = RPC.getProxy(userService.class, 100000, new InetSocketAddress("localhost", 9999), configuration);
        int user = client.getUser(33333333);
    }
}
