FROM ubuntu:latest
LABEL authors="kpala"

ENTRYPOINT ["top", "-b"]