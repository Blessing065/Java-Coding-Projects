public class PAintJob   {
    public static void main(String[] args) {
        System.out.println("For first Method");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));


        System.out.println("For Second Method");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));


        System.out.println("For third method");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));


    }



    public static int getBucketCount(double width , double height , double areaPerBucket , int extraBuckets ){


        if((width <= 0) || (height <= 0) ||(areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }
        else{
            double area=width * height;
            double areaCovered = areaPerBucket * extraBuckets;
            double remainingArea=(area - areaCovered) / areaPerBucket ;


            int bucketCount = (int) Math.ceil(remainingArea);
            return bucketCount;
        }
    }

    public static int getBucketCount(double width , double height , double areaPerBucket ){
        if((width <=0) || (height <= 0) || (areaPerBucket <= 0)){return -1;}
        else{

            double area = width * height;
            double totalAreaToBeCovered = area / areaPerBucket;
            int bucketCount = (int)(Math.ceil(totalAreaToBeCovered));
            return bucketCount;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket ){
        if((area <=0) || (areaPerBucket <=0)){return -1;}
        else{

            int bucketCount=(int)(Math.ceil( area / areaPerBucket));
            return bucketCount;
        }
    }
}
