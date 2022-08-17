import * as React from "react";
import { useState } from "react";
import { BoardCellStyled } from "./components/BoardCell";

export const BoardComponent = React.memo(({ boardCellMatrix }) => {

    const boardCells = boardCellMatrix.map((row, r) =>
        row.map((cell, c) => (
            <BoardCellStyled
                key={`cell(${r.toString()},${c.toString()})`}
                r={cell.r + 1}
                c={cell.c + 1}
                char={cell.char}
                hasMatched={cell.hasMatched}
            >
                {cell.char}
            </BoardCellStyled>
        ))
    );

    return <>{boardCells}</>;
});
