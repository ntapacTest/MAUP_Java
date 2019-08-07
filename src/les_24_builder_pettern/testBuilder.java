package les_24_builder_pettern;

public class testBuilder {
    public static void main(String[] args) {

        Entity entity=new Entity.Builder().set_b(true).set_c('e').build();

        System.out.println(entity);

        Entity entity2=Entity.getBuilder().set_b(true).set_c('e').set_s("sdfdsfds").build();

        System.out.println(entity2);

    }
}
