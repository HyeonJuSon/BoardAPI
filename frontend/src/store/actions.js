/* eslint-disable*/
import $axios from 'axios';

export function join({ state }, User) {
    return $axios.post("/user/join", User);
}