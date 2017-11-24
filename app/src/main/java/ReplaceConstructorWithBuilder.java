public class ReplaceConstructorWithBuilder {

    static class Shape {

        private final Integer height;
        private final Integer width;
        private final Integer id;
        private final Integer colorId;

        Shape(Integer height, Integer width, Integer id, Integer colorId) {
            this.height = height;
            this.width = width;
            this.id = id;
            this.colorId = colorId;
        }
    }
}
