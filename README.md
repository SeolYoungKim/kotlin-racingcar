# kotlin-racingcar
## 3단계 
### 기능 요구 사항 
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 프로그래밍 요구 사항 
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다

### 기능 목록
- 사용자 
  - [x] 자동차 대수를 입력할 수 있다 
  - [x] 이동 횟수를 정할 수 있다
- 자동차 생산소 (CarFactory)
  - [x] 입력된 대수만큼 자동차를 만든다
- 자동차 경주 게임 (RacingCarGame)
  - [x] 입력된 이동 횟수만큼 이동을 시도한다
    - [x] 0~9 사이의 무작위 값을 자동차에게 전달한다  
- 자동차
  - [x] ~~입력 값 만큼 이동한다~~
  - [x] 값이 4 이상일 경우에 1칸 전진한다 
- 출력
  - [x] 자동차 대수 입력하라는 메세지
  - [x] 시도 횟수 입력하라는 메세지
  - [x] 실행 결과를 매 이동마다 출력

## 4단계
### 기능 요구사항 
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

### 기능 목록 
- 입력 
  - [] 자동차 대수가 아니라 이름을 입력한다
    - [] 이름은 `,`를 기준으로 구분한다 
- 자동차
  - [] 자동차에 이름을 부여한다
    - [] 이름은 5글자를 초과할 수 없다 
- 결과 생성기 
  - [] 자동차 이름을 함께 출력한다 
- 우승자 선출 
  - [] 가장 많이 이동한 우승자를 선출한다. 
    - 동일할 경우 모두 선출한다. 