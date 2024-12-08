package RPC;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException {

        Configuration configuration=new Configuration();
        RPC.Builder builder = new RPC.Builder(configuration);
        RPC.Server server = builder.setBindAddress("localhost").setPort(9999).setProtocol(userService.class).setInstance(new userServiceImpl()).build();

        server.start();

    }




}
