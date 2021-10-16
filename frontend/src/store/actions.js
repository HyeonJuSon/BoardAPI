/* eslint-disable*/
import $axios from 'axios';

export function join({ state }, User) {
    return $axios.post("/son/user/join", User);
}

export function getUser({ state }, userid) {
    return $axios.get(`/son/user/${userid}`);
}