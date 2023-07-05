
public class Render {

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {

        if (object instanceof HasHealth) {
            ((HasHealth) object).HealthBar();
        }

        if (object instanceof HasMana) {
            ((HasMana) object).ManaBar();
        }

    }
}