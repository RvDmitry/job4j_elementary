package ru.job4j.ex;

/**
 * Class UserStore
 * Класс определяет хранилище пользователей.
 * @author Dmitry Razumov
 * @version 1
 */
public class UserStore {
    /**
     * Метод осуществляет поиск пользователя.
     * @param users Массив пользователей по которым осуществляется поиск
     * @param login Имя пользователя
     * @return Пользователь
     * @throws UserNotFoundException Исключение, если пользователь не найден
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("No user with this name was found.");
        }
        return result;
    }

    /**
     * Метод проверяет статус доступа пользователя, а также длину имени пользователя.
     * Генерирует исключение, если у пользователя доступ отсутствует либо в имени менее трех символов.
     * @param user Пользователь, которого нужно проверить
     * @return true, если проверка прошла успешно
     * @throws UserInvalidException Исключение, если проверка прошла не успешно
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    /**
     * Главный метод программы. Создает массив пользователей. Выполняет запрос к хранилищу.
     * Осуществляется обработка нескольких исключений.
     * @param args Параметры командной строки
     */
    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
