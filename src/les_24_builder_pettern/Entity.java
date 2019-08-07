package les_24_builder_pettern;

public class Entity {
    private String s;
    private boolean b;
    private int i;
    private double d;
    private char c;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Entity() {}

    @Override
    public String toString() {
        return "Entity{" +
                "s='" + s + '\'' +
                ", b=" + b +
                ", i=" + i +
                ", d=" + d +
                ", c=" + c +
                '}';
    }


    static class Builder{
        private Entity tmp;
        public Builder() {
            tmp=new Entity();
        }

        public Builder set_s(String s) {
            this.tmp.s = s;
            return this;
        }
        public Builder set_b(boolean b) {
            this.tmp.b = b;
            return this;
        }
        public Builder set_i(int i) {
            this.tmp.i = i;
            return this;
        }
        public Builder set_d(double d) {
            this.tmp.d = d;
            return this;
        }
        public Builder set_c(char c) {
            this.tmp.c = c;
            return this;
        }

        public Entity build(){
            return tmp;
        }
    }
}
