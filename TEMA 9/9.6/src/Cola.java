public interface Cola {
    void encolar(Integer nuevo);

    Integer desencolar();

    default void encolarMultiple(Integer nuevo, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            encolar(nuevo);

        }
    }
}
