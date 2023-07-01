public class Oops_gettersSetters {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();

        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        }
    }
    class Pen1 {
        private String color;
        private int tip;

        String getColor() {
            return this.color;
        }
        int getTip() {
            return this.tip;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setTip(int tip) {
            this.tip = tip;
        }
    }


