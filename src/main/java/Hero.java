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
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    @Override
    public int getCurrentManaPoint() {
        return currentManaPoint;
    }
}
