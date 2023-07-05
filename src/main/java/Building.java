public class Building implements HasHealth {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        if (currentHealthPoint >= 0) {
            this.currentHealthPoint = currentHealthPoint;
        } else {
            throw new IllegalArgumentException("Здоровье не может быть отрицательным!");
        }
    }

    @Override
    public void HealthBar() {
        System.out.println("Здоровье строения: " + currentHealthPoint + "/" + maxHealthPoint);
    }
}
