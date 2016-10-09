package part4.Больница;

import org.springframework.beans.factory.annotation.Autowired;

public class ХирургImpl implements Хирург {

    @Autowired
    private Асистент асистент;

    public void оперировать() {
        System.out.println("Спирт");
        асистент.getСпирт().налить();
        System.out.println("Скальпель");
        асистент.getСкальпель().резать();
        System.out.println("Спирт");
        асистент.getСпирт().налить();
        System.out.println("Спирт");
        асистент.getСпирт().налить();
        System.out.println("Соленый огурец");
        СоленыйОгурец соленыйОгурец = асистент.getСоленыйОгурец();
        if (соленыйОгурец.isЖеванный()) {
            System.out.println("Ах ты гад!!! Ты мне дал использованный огурец");
        } else {
            соленыйОгурец.жеваться();
            System.out.println("Хорошо пошла");
        }
    }
}
