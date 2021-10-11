package com.example.myyoutube;

import java.util.ArrayList;

public class Youtube {

    // 네트워크로 받는 객체 전달
    String title;
    String subtitle;
    String runTime;
    String mainImageUri;

    // 생성자
    public Youtube(String title, String subtitle, String runTime, String mainImageUri) {
        this.title = title;
        this.subtitle = subtitle;
        this.runTime = runTime;
        this.mainImageUri = mainImageUri;
    }

    // 샘플 데이터 생성

    public static ArrayList<Youtube> getYoutubeList() {
        ArrayList<Youtube> youtubeArrayList = new ArrayList<>();

        youtubeArrayList.add(
                new Youtube(
                        "예쁜 강아지",
                        "강아지의 하루는 어떨까?",
                        "10:35",
                        "https://cdn.pixabay.com/photo/2019/07/30/05/53/dog-4372036_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "MakeUp",
                        "겟 레디 윗 미 - 같이 준비해요!",
                        "7:15",
                        "https://cdn.pixabay.com/photo/2018/01/13/19/26/fashion-3080626_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "바보들",
                        "비보들의 일상",
                        "8:35",
                        "https://cdn.pixabay.com/photo/2015/04/27/22/53/man-742766_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "전자기기 알아보기",
                        "전자기기 오래 사용하는 루틴 공유합니다.",
                        "5:10",
                        "https://cdn.pixabay.com/photo/2015/01/08/18/25/desk-593327_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "말 안듣는 강아지",
                        "강형욱의 강아지 키우기",
                        "10:35",
                        "https://cdn.pixabay.com/photo/2017/09/25/13/12/cocker-spaniel-2785074_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "예쁜 강아지",
                        "강아지의 하루는 어떨까?",
                        "10:35",
                        "https://cdn.pixabay.com/photo/2019/07/30/05/53/dog-4372036_960_720.jpg"
                ));
        youtubeArrayList.add(
                new Youtube(
                        "예쁜 강아지",
                        "강아지의 하루는 어떨까?",
                        "10:35",
                        "https://cdn.pixabay.com/photo/2019/07/30/05/53/dog-4372036_960_720.jpg"
                ));
    return youtubeArrayList;
    }


}
