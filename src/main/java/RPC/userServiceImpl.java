package RPC;

public class userServiceImpl implements userService{

    @Override
    public int   getUser(int id)
    {
        System.out.println("getUser:"+id);
        return  id;
    }

}
