# syntax=docker/dockerfile:1

# https://docs.docker.com/go/dockerfile-reference/

FROM alpine:latest

RUN apk add --no-cache zsh

ARG UID=10001
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "/nonexistent" \
    --shell "/sbin/nologin" \
    --no-create-home \
    --uid "${UID}" \
    appuser
USER appuser

ENTRYPOINT [ "/bin/zsh" ]
