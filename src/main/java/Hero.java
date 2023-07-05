public class Hero implements HasHealth, HasMana {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        if (currentHealthPoint >= 0) {
            this.currentHealthPoint = currentHealthPoint;
        } else {
            throw new IllegalArgumentException("Здоровье не может быть отрицательным!");
        }
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        if (currentManaPoint >= 0) {
            this.currentManaPoint = currentManaPoint;
        } else {
            throw new IllegalArgumentException("Энергия не может быть отрицательной!");
        }
    }

    @Override
    public void HealthBar() {
        System.out.println("Здоровье героя: " + currentHealthPoint + "/" + maxHealthPoint);
    }

    @Override
    public void ManaBar() {
        System.out.println("Энергия героя: " + currentManaPoint + "/" + maxManaPoint);
    }
}
