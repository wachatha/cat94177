package com.cat.demo;

public class Unit {

        private Long id;
        private String unitName;

        public Unit(String unitName) {
            this.unitName = unitName;
        }

        private Unit() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUnitName() {
            return unitName;
        }

        public void setUnitName(String unitName) {
            this.unitName = unitName;
        }

        @Override
        public String toString() {
            return "Unit{" +
                    "id=" + id +
                    ", unitName='" + unitName + '\'' +
                    '}';
        }
    }


