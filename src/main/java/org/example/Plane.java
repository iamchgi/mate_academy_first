package org.example;

public class Plane {
    private String name;
    private String sn;
    private int width;
    private int height;
    private int length;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.sn = planeBuilder.sn;
        this.width = planeBuilder.width;
        this.height = planeBuilder.height;
        this.length = planeBuilder.length;
    }

    public class PlaneBuilder {
        private String name;
        private String sn;
        private int width;
        private int height;
        private int length;

        public void setName(String name) {
            this.name = name;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
