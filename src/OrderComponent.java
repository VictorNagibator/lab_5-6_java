public interface OrderComponent {
    String getObjectName();
    String getName();
    static OrderComponent create() { return null; }
    void input();
}