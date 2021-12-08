package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Bohdan")
                .lastName("Ivashko")
                .age(19)
                .build();
        System.out.println(user);
    }
}
