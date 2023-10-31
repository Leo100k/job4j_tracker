package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");

    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        }
        throw new UserInvalidException("User not valid");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Petr", false),
                new User("Pe", true)
        };
        try {
            User user = findUser(users, "oooo");
            if (validate(user)) {
                System.out.println("This user has an access");
            }

        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException ea) {
            ea.printStackTrace();
        }

    }
}