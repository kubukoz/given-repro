import cats.MonadError
import cats.effect.IO

sealed trait Failure extends Throwable

def demo[F[_]](using MonadError[F, Failure]) = ???

def demo2 = demo[IO]
