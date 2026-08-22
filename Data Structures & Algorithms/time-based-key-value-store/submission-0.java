class TimeMap {

    HashMap<String, ArrayList<Item>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Item item = new Item(value, timestamp);
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<Item>());
        }
        ArrayList<Item> list = map.get(key);
        list.add(item);
        map.put(key, list);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        return helper(map.get(key), 0, map.get(key).size()-1, timestamp);
    }

    private String helper(ArrayList<Item> arr, int low, int high, int timestamp){
        String result = "";
        while(low <= high){
            int mid = (low + high)/2;

            if(timestamp >= arr.get(mid).timestamp){
                result = arr.get(mid).name;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;


    }
}

class Item {
    String name;
    int timestamp;
    public Item(String name, int timestamp){
        this.name = name;
        this.timestamp = timestamp;
    }
}
