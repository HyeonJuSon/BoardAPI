/* eslint-disable*/
import $axios from 'axios';

export function join({ state }, User) {
    return $axios.post("/user/join", User);
}

export function getUser({ state }, userid) {
    return $axios.get(`/user/${userid}`);
}