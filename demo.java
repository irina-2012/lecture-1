public static List <Integer> availableDevider (int number) {
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i < number; i ++){
        if (number % i = 0){
            result.add(i);
        }
    }    
    return result;
}