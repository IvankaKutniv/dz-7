package com.itproger;

import java.awt.*;

public enum GeometricFigure implements Shape {

    CIRCLE  {
        @Override
        public double calculateAria() {

            return Math.PI * raduis * length;
        }
    },
    RECTANGLE {
        @Override
        public double calculateAria() {

            return length * width;
        }
    };

    double raduis;
    double length;
    double width;

}
