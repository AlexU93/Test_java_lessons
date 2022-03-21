package ru.itmo.lessons.lesson7.base;

    abstract public class Unit {
        /* доступ к свойству из текущего класса + дочерних классов */
        protected int healthScore;
        private int maxHealtScore;

        public Unit(int healthScore) { // создаем конструктор
            if (healthScore < 1) {
                throw new IllegalArgumentException("Здоровье должно быть положительным");
            }
            this.healthScore = healthScore;
            maxHealtScore = healthScore; // присваеваем мак здоровье базовому
        }

        public boolean isAlive() { // Метод на проверку живой ли юнит
            return healthScore > 0; // Возвращает только положительное здоровье
        }

        public void plusHealth(int healthScore) {
            if (!isAlive()) return;
            this.healthScore = Math.min(this.healthScore + healthScore, maxHealtScore); // определяем минимальное значение здоровья
        }

        public void minusHealth(int healthScore) {
            if (!isAlive()) return;
            this.healthScore -= healthScore;

        }

        public int getHealthScore() {
            return healthScore;
        }

        // абстрактный мето - содержится только в абстрактным классе
        // без {}
        public abstract void rest ();
    }
