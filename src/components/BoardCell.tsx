import styled from "styled-components";
import { EMPTY } from "../App";

export interface BoardCell {
    x: number;
    y: number;
}

export const BoardCellStyled = styled.div`
  width: auto;
  background: ${(props) => props.char === EMPTY ? "none" : "red"};
  text: ${(props) => props.char === EMPTY ? "none" : "red"};
  border: 2px solid;
  grid-row: ${(props) => props.r};
  grid-column: ${(props) => props.c};
  text-align: center;
`;
