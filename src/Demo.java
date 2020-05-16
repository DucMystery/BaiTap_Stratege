public class Demo {

    private static void execute(UserStorage storage,User user){
        storage.store(user);
    }

    public static void main(String[] args) {
        UserStorage []storages = {new XMLStorage(),new MysSQLStorage()};

        User user = new User("My Storage");
        for (UserStorage storage :storages){
            storage.store(user);
        }

    }
}
