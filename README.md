Infodio ������ ���̵��Դϴ�.
============================

�����ϱ� ����
-------------
1. *.aar ���̺귯�� ������ ������ �ּ���
2. Gson ���̺귯���� ������ �ּ���

��ġ ���� ���
--------------
 <pre><code>
 private void startTracking(){
     infodio.startTracking(infodioLocationListener);

     ...
 }

 ...

 Infodio.InfodioLocationListener infodioLocationListener = new Infodio.InfodioLocationListener() {
     @Override
     public void onUpdatedLocation(final Location location, Exception e) {
         Log.d("test", "onUpdateLocation");
         if(e!=null){
             e.printStackTrace();
             return;
         }

         Log.d("test", "lat: " + location.getLatitude() + ", lng: " + location.getLongitude());

         runOnUiThread(new Runnable() {
             @Override
             public void run() {
                 tv_loction.setText("lat : "+location.getLatitude()
                         +"\nlng : "+location.getLongitude());
             }
         });

     }
};
 
 </code></pre> 