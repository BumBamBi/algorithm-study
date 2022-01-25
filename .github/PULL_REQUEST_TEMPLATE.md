## 문제 :mag:

[BOJ/2562번](https://www.acmicpc.net/problem/2562) 최댓값

## 히스토리 :memo:

> 1회 : 런타임 에러 <br>
> 2회 : 런타임 에러 <br>
> 3회 : [성공](./baekjoon_02562_max.c)
- 연결리스트 사용 시 런타임에러가 자주 발생함
- Valgrind 테스트 결과 "Conditional jump or move depends on uninitialised value(s)"라는 오류가 다수 발생
- 메모리 할당, 해제, 초기화 문제를 보완 후 제출
- cf. 런타임에러 주요발생 원인
> 1. 배열에 할당된 크기를 넘어서 접근했을 때
> 2. 전역 배열의 크기가 메모리 제한을 초과할 때
> 3. 지역 배열의 크기가 스택 크기 제한을 넘어갈 때
> 4. 0으로 나눌 떄
> 5. 라이브러리에서 예외를 발생시켰을 때
> 6. 재귀 호출이 너무 깊어질 때
> 7. 이미 해제된 메모리를 또 참조할 때
> 8. 프로그램(main 함수)이 0이 아닌 수를 반환했을 때

참고자료 : [1. 런타임에러 원인](https://www.acmicpc.net/board/view/22980), [2. valgrind 오류](https://riptutorial.com/ko/c/example/31816/valgrind%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94-%EB%8F%99%EC%95%88-%EB%B0%9C%EC%83%9D%ED%95%98%EB%8A%94-%EA%B0%80%EC%9E%A5-%EC%9D%BC%EB%B0%98%EC%A0%81%EC%9D%B8-%EC%98%A4%EB%A5%98), [3. valgrind 활용법](http://forum.falinux.com/zbxe/?mid=lecture_tip&page=13&document_srl=528619&m=1)
<br>

## 하고 싶은 말(optional)

`궁금한점이나 회고`
