export class MatchResult {
  match_id: bigint;
  homeTeam_id: bigint;
  homeTeam_name: string;
  awayTeam_id: bigint;
  awayTeam_name: string;
  homeTeamScored: number;
  awayTeamScored: number;
  homeTeamPenalties: number;
  awayTeamPenalties: number;
  matchTime: string;
  league_id: bigint;
  league_name: string;
}
