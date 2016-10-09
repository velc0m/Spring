package part4.Больница;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class АсистентImpl implements Асистент {

    @Autowired
    private Спирт спирт;

    @Autowired
    private Скальпель скальпель;

    public abstract СоленыйОгурец getСоленыйОгурец();

    public Спирт getСпирт() {
        return спирт;
    }

    public Скальпель getСкальпель() {
        return скальпель;
    }
}
