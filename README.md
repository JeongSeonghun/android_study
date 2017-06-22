Infodio 개발자 가이드입니다.
============================

시작하기 전에
-------------
1. *.aar 라이브러리 파일을 연결해 주세요
2. Gson 라이브러리를 포함해 주세요

위치 추적 사용
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