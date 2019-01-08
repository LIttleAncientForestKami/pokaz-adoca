    public int foo() {
        int result = 1;
        try {
            return result;
        } finally {
            result++;
        }
    }
    
    System.out.println("Result of foo(): " + foo());
