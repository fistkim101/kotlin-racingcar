# 🚀 3단계 - 자동차 경주

## 초간단 자동차 경주 게임 구현

### 기능 요구 사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
  - 예외
    - [x] 자동차 대수 입력에 null 또는 빈 값이 들어오는 경우
    - [x] 자동차 대수 입력에 자연수가 들어오지 않는 경우
    - [x] 시도할 횟수 입력에 null 또는 빈 값이 들어오는 경우
    - [x] 시도할 횟수 입력에 자연수가 들어오지 않는 경우
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
  - [x] 테스트를 위한 `MovingStrategy` 구현 
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
  - [x] `Scoreboard`를 통해 자동차별 이동 이력 저장

### 실행 결과

```
자동차 대수는 몇 대인가요?
3
시도할 횟수는 몇 회인가요?
5

실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----
```

### 프로그래밍 요구 사항

- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.