public class Main {
    public static void main(String[] args) {
        logging("asd_13", "123", "123");
    }

    public static void logging(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password");
        } finally {
            System.out.println("Verification completed");
        }
    }

    public static void checkLogin(String login) throws WrongLoginException {
        if (!isAlpha(login) || login.length() > 20) {
            throw new WrongLoginException();
        }
    }

    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!isAlpha(password) || password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (Character.isLetter(c) || Character.isDigit(c) || c == '_') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}