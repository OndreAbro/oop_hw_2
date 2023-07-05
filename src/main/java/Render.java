
public class Render {

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {

        if (object instanceof HasHealth) {
            int maxHealth = ((HasHealth) object).getMaxHealthPoint();
            int currentHealth = ((HasHealth) object).getCurrentHealthPoint();
            System.out.println("Здоровье: " + currentHealth + "/" + maxHealth);
        }

        if (object instanceof HasMana) {
            int maxMana = ((HasMana) object).getMaxManaPoint();
            int currentMana = ((HasMana) object).getCurrentManaPoint();
            System.out.println("Энергия: " + currentMana + "/" + maxMana);
        }

    }
}