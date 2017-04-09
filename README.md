Twitter bot

# 설명
일정 주기로 정해진 메시지를 자동으로 트윗하는 봇 입니다
항상 실행 상태로 유지되어야 합니다


# 준비물

1. Twitter에 App을 통해 메시지를 보내려면 app 등록과 oauth 인증에 필요한 토큰이 필요합니다.
등록은 https://apps.twitter.com에서 하세요
    * 사이트 접속 후 'Create New App' 버튼을 클릭
    * Name에 봇 네임을 나머지는 적당히 넣어주고 'Create your Twitter Application' 클릭
1. app이 등록되면 기본적으로 아래의 2키가 만들어집니다
(용어: 컨슈머? 컨슈머는 일종의 Twitter API를 이용하는 app)
    * Consumer Key (API Key)
    * Consumer Secret (API Secret)
1. app에서 API에 접근하기 위한 access 토큰을 생성
    * Application Settings의 Consumer Key (API Key) 'manage keys and access tokens' 을 클릭
    * Create my access token 클릭하여 생성
1. 이제 준비는 끝났습니다. ^^

# TwitterBot 소스를 받거나 git clone하세요

# twitter4j.properties 작성
준비 단계에서 4개의 키를 http://twitter4j.org/en/configuration.html 을 참고해서 작성하세요.

# 처음 실행
처음 실행하면 'Hello 날짜' 형태로 트윗 메시지가 보내집니다
그러면 성공