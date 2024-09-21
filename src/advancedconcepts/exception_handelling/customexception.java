​class CustomException {
    public static void main(String[] args) {
        try {
            int age = -5; // Let's assume age cannot be negative
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            System.out.println("Age: " + age);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}