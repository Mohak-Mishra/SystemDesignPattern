package com.mishra.mohak.builderDesignPattern;

import lombok.Getter;

@Getter
public class Burger {
    private Burger(BurgerBuilder builder) {}

   private String size;
   private boolean onions;
   private boolean cheese;
   private boolean tomatoes;
   private boolean lettuce;
   private boolean mayo;


    public static class BurgerBuilder{
        private String size;
        private boolean onions;
        private boolean cheese;
        private boolean tomatoes;
        private boolean lettuce;
        private boolean mayo;
        public BurgerBuilder size(String size){
            System.out.println("size: "+size);
            this.size = size;
            return this;
        }
        public BurgerBuilder onions(boolean onions){
            System.out.println("onions: "+onions);
            this.onions = onions;
            return this;

        }
        public BurgerBuilder cheese(boolean cheese){
            System.out.println("cheese: "+cheese);
            this.cheese = cheese;
            return this;
        }
        public BurgerBuilder tomatoes(boolean tomatoes){
            System.out.println("tomatoes: "+tomatoes);
            this.tomatoes = tomatoes;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            System.out.println("lettuce: "+lettuce);
            this.lettuce = lettuce;
            return this;
        }
        public BurgerBuilder mayo(boolean mayo){
            System.out.println("mayo: "+mayo);
            this.mayo = mayo;
            return this;
        }
        public Burger build() {
            return new Burger(this);
        }
    }


}
