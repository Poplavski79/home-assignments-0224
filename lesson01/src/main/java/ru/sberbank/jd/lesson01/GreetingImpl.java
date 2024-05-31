package ru.sberbank.jd.lesson01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Класс описывающий меня.
 */

public class GreetingImpl implements Greeting {

    private final String firsName = "Алексей";
    private final String lastName = "Поплавский";
    private final int birthYear = 1979;
    private final List<String> hobbies = Arrays.asList("Картины по номерам", "Металлические пазлы");
    private final String repoUrl = "https://github.com/Poplavski79/home-assignments-0224/blob/develop/";
    private final String phone = "+7(952)902-50-79";
    private final List<String> courseExpectations = Arrays.asList("Возможность создавать проекты на языке JAVA",
            "Понимание framework");

    /**
     * Получение имени.
     *
     * @return имя
     */
    @Override
    public String getFirstName() {
        return firsName;
    }

    /**
     * Получение фамилии.
     *
     * @return фамилию
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * Получение года рождения.
     *
     * @return год рождения
     */
    @Override
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Получение списка хобби.
     *
     * @return список хобби
     */
    @Override
    public Collection<String> getHobbies() {
        return hobbies;
    }

    /**
     * Получения адреса репозитория.
     *
     * @return адрес репозитория
     */
    @Override
    public String getRepoUrl() {
        return repoUrl;
    }

    /**
     * Получение номера телефона.
     *
     * @return номер телефона
     */
    @Override
    public String getPhone() {
        return phone;
    }

    /**
     * Получение ожидания от курса.
     *
     * @return список ожиданий от курса
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return courseExpectations;
    }
}
