public class MysSQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println(user+". CSDL MySQLStorage");
    }
}
